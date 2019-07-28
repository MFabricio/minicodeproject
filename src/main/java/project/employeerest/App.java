package project.employeerest;

import static project.employeerest.controller.EmployeeController.*;
import static spark.Spark.*;

public class App 
{
    public static void main( String[] args ){

        get("/employee/:id", (request, response) -> {
            return getEmployee(request.params(":id"));
        }, new JsonTransformer());

        get("/employee", (request,response) -> {
            return getEmployees();
        },new JsonTransformer());

        post("/employee", (request, response) -> {
            return addEmployee(request.body());
        });

        put("/employee", (request, response) ->{
            return updateEmployee(request.body());
        });

        delete("/employee/:id", (request, response) -> {
            return deleteEmployee(request.params(":id"),request.headers("Auth"));
        });
    }

}
