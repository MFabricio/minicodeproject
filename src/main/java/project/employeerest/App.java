package project.employeerest;

import project.employeerest.controller.EmployeeController;
import project.employeerest.model.Employee;

import java.time.LocalDate;

import static spark.Spark.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        LocalDate ld = LocalDate.now();

        get("/employee/:id", (request, response) -> {
            return EmployeeController.getEmployee(request.params(":id"));
        }, new JsonTransformer());
        get("/employee", (request,respone) -> "all");
        //Add
        post("/employee", (request, response) -> "post");
        //Update
        put("/employee", (request, response) -> "put");
        //Delete
        delete("/employee", (request, response) -> "delete");
    }
}
