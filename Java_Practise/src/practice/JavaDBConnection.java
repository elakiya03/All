package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class JavaDBConnection {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/trial", "root",
					"Admin@2022");

			Statement stmt = connection.createStatement();
			Scanner sc = new Scanner(System.in);

			System.out.println("Welcome to JDBC..... ");

			while (true) {
				System.out.println("\n1 Insert \n2 Update \n3 Delete \n4 View \n5 Sort \n6 Delete cloumn \n7Exit");
				System.out.print("Enter options to perform operations");

				int x = sc.nextInt();

				switch (x) {

				case 1:
					int result = stmt.executeUpdate(
							"insert into employees(id, email_id, first_name, last_name) values('4','elakiya@gmail.com','Elakiya','Sundar')");
					// if result is greater than 0, it means values has been added
					if (result > 0)
						System.out.println("successfully inserted");
					else
						System.out.println("unsucessfull insertion ");
					break;

				case 2:

					PreparedStatement p = connection
							.prepareStatement("update employees set first_name='Washington' where id=4");
					p.execute();
					break;

				case 3:
					PreparedStatement r = connection.prepareStatement("delete from employees where id=4");
					r.execute();
					break;
				case 4:
					ResultSet rs = stmt.executeQuery("Select * from employees");

					System.out.println("Records are");

					while (rs.next()) {
						System.out.println(
								rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4));
					}
					break;
				case 5:
					ResultSet res = stmt.executeQuery("Select * from employees order by last_name");
					while (res.next()) {
						System.out.println(res.getInt(1) + " " + res.getString(2) + " " + res.getString(3) + " "
								+ res.getString(4));
					}
					break;
				case 6:
					String query = "ALTER TABLE student Drop address";

					// executeUpdate() returns number of rows
					// affected by the execution of the statement
					int resu = stmt.executeUpdate(query);

					// if result is greater than 0
					// it means values has been added
					if (resu > 0)
						System.out.println("A column from the table is deleted.");
					else
						System.out.println("unsuccessful deletion ");
					break;
				case 7:
					System.out.println("Have a nice day! GoodBye!! See you soon!!!");
					System.exit(0);

				}
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
