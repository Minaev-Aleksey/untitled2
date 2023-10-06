package org.example;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLConnect {
    public static void main(String[] args) throws SQLException {

//        Для добавления в таблицу данных
//        String sql = """
//
//                """;

        try (Connection connection = ConnectionManager.open();
             Statement statement = connection.createStatement()) {
//            System.out.println(connection.getTransactionIsolation());
//            Boolean executeResult = statement.execute(sql);
//            System.out.println(executeResult);
            System.out.println("==============================================");
//            //Выводит хобби
//            ResultSet resultSet = statement.executeQuery("SELECT * FROM hobbies");
//            while (resultSet.next()) {
//                String hobbi = resultSet.getString(1);
//                System.out.println(hobbi);
//                System.out.println("==============================================");
//            }
//            //Выводит персонажей и возраст
//            ResultSet resultSet2 = statement.executeQuery("SELECT * FROM person");
//            while (resultSet2.next()) {
//                String name = resultSet2.getString(1);
//                int age = resultSet2.getInt(2);
//                System.out.println(" Name: " + name + ", age: " + age);
//                System.out.println("==============================================");
//            }
//            // Вывоит персонажей и их хобби
            ResultSet resultSet3 = statement.executeQuery(
                    "SELECT person.name, person.age, hobbies.hobbies FROM person, hobbies WHERE person.name=hobbies.name ");
            while (resultSet3.next()) {
                String name = resultSet3.getString("name");
                int age = resultSet3.getInt("age");
                String hobbi = resultSet3.getString("hobbies");
                System.out.println(" Name: " + name + ", age: " + age + ", hobbi: " + hobbi);
                System.out.println("==============================================");
            }

//            ResultSet resultSet4 = statement.executeQuery("SELECT * FROM person, hobbies");
//            String name = resultSet4.getString(1);
//            System.out.println(name);


            connection.close();
            statement.close();
        }

    }
}
//        Альтренативный вариант подключения базы данных
//        String username = "postgres";
//        String password = "Minaev89/";
//        String url = "jdbc:postgresql://localhost:5433/testdb";
//        Class.forName("org.postgresql.Driver");

//        try (Connection connection = DriverManager.getConnection(
//                "jdbc:postgresql://localhost:5433/testdb", "postgres", "Minaev89/");) {
//            System.out.println(connection.getTransactionIsolation());
//            connection.close();
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }