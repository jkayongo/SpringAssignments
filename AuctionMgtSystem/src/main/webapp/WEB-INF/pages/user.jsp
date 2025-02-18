<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>User Form</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 20px;
        }
        form {
            max-width: 400px;
            margin: auto;
            padding: 20px;
            border: 1px solid #ccc;
            border-radius: 10px;
            box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
        }
        label {
            display: block;
            margin-bottom: 8px;
            font-weight: bold;
        }
        input {
            width: 100%;
            padding: 8px;
            margin-bottom: 15px;
            border: 1px solid #ccc;
            border-radius: 5px;
        }
        button {
            padding: 10px 15px;
            background-color: #007bff;
            color: #fff;
            border: none;
            border-radius: 5px;
            cursor: pointer;
        }
        button:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
    <h1>User Information Form</h1>
    <form action="/AuctionMgtSystem-0.0.1-SNAPSHOT/appUsers" method="POST">
		
        <label for="userName">User Name:</label>
        <input type="text" id="userName" name="userName" placeholder="Enter your username" value="${user.userName}" required>

        <label for="email">Email:</label>
        <input type="email" id="email" name="email" placeholder="Enter your email" value="${user.email}" required>

        <label for="placeOfResidence">Place of Residence:</label>
        <input type="text" id="placeOfResidence" name="placeOfResidence" placeholder="Enter your place of residence" value="${user.placeOfResidence}" required>

        <button type="submit">Submit</button>
    </form>
</body>
</html>
