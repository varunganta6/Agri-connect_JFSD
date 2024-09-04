<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/styles.css">
    <title>Registration</title>
</head>
<body>
    <div class="registration-container">
        <h3>New Registration</h3>
        <hr>
        <form class="form-horizontal" method="POST" action="save-user">
            <input type="hidden" name="id" value="${user.id }" />
            <div class="form-group">
                <label class="control-label col-md-3">Username</label>
                <div class="col-md-7">
                    <input type="text" class="form-control" name="username"
                        value="${user.username }" />
                </div>
            </div>
            <div class="form-group">
                <label class="control-label col-md-3">First Name</label>
                <div class="col-md-7">
                    <input type="text" class="form-control" name="firstname"
                        value="${user.firstname }" />
                </div>
            </div>
            <div class="form-group">
                <label class="control-label col-md-3">Last Name</label>
                <div class="col-md-7">
                    <input type="text" class="form-control" name="lastname"
                        value="${user.lastname }" />
                </div>
            </div>
            <div class="form-group">
                <label class="control-label col-md-3">Age </label>
                <div class="col-md-3">
                    <input type="text" class="form-control" name="age"
                        value="${user.age }" />
                </div>
            </div>
            <div class="form-group">
                <label class="control-label col-md-3">Password</label>
                <div class="col-md-7">
                    <input type="password" class="form-control" name="password"
                        value="${user.password }" />
                </div>
            </div>
            <div class="form-group ">
                <input type="submit" class="btn btn-primary" value="Register" />
            </div>
        </form>
    </div>
</body>
</html>
