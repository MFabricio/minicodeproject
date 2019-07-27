package project.employeerest;

import java.time.LocalDate;

import static project.employeerest.controller.EmployeeController.*;
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
            return getEmployee(request.params(":id"));
        }, new JsonTransformer());
        get("/employee", (request,respone) -> {
            return getEmployees();
        },new JsonTransformer());
        //Add
        post("/employee", (request, response) -> "post");
        //Update
        put("/employee", (request, response) -> "put");
        //Delete
        delete("/employee/:id", (request, response) -> {
            return deleteEmployee(request.params(":id"),request.headers("Auth"));
        });
    }
}
