<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>User Login</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
    <script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</head>
<style>


.form-control{
background: rgba(0, 0, 0, 0.01) !important;

}

</style>

<body >


    <div >
        <div class="col-4" style="margin: 10% auto;background: rgba(0, 0, 0, 0.05);padding-top: 15px;border-radius: 10px" >
            <h2 style="text-align: center;">LOGIN</h2>
           <h4 style="color: red; font-weight: bold;text-align: center;">${SPRING_SECURITY_LAST_EXCEPTION.message}</h4>
            <form action="login" method="POST">
                <div class="form-group">
                    <label for="username">Username: </label>
                    <input type="text" name="username" class="form-control" placeholder="username" required>

                </div>
                <div class="form-group">
                    <label for="password">Password : </label>
                    <input type="password" name="password" class="form-control" placeholder="password" required>


                </div>

                <div class="text-center" style="padding-bottom: 15px"><button class="btn btn-info" type="submit">LOGIN</button></div>
                

            </form>

        </div>
    </div>

</body>

</html>