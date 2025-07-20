package application;

import model.entities.Department;
import model.entities.Seller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Program {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Department obj = new Department(1, "Books");

        Seller seller = new Seller(1800.0, (sdf.parse("25/02/2002")), obj, "andreyviddutra@gmail.com", 2, "Andreyvid");

        System.out.println(seller);

    }
}
