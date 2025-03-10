<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>User Registration</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
    <style>
        body {
            background-color: #f8f9fa;
            font-family: Arial, sans-serif;
        }
        .container {
            max-width: 500px;
            margin-top: 50px;
        }
        .card {
            border-radius: 10px;
            box-shadow: 0px 4px 6px rgba(0, 0, 0, 0.1);
        }
        .btn-custom {
            background-color: #007bff;
            color: white;
        }
        .btn-custom:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>

    <div class="container">
        <div class="card p-4">
            <h3 class="text-center">User Registration</h3>

            <form id="registrationForm">
                <!-- Full Name -->
                <div class="mb-3">
                    <label for="fullName" class="form-label">Full Name</label>
                    <input type="text" class="form-control" id="fullName" required>
                </div>

                <!-- Email -->
                <div class="mb-3">
                    <label for="email" class="form-label">Email Address</label>
                    <input type="email" class="form-control" id="email" required>
                </div>

                <!-- Password -->
                <div class="mb-3">
                    <label for="password" class="form-label">Password</label>
                    <input type="password" class="form-control" id="password" required>
                </div>

                <!-- Confirm Password -->
                <div class="mb-3">
                    <label for="confirmPassword" class="form-label">Confirm Password</label>
                    <input type="password" class="form-control" id="confirmPassword" required>
                </div>

                <!-- User Role -->
                <div class="mb-3">
                    <label for="role" class="form-label">Select Role</label>
                    <select class="form-control" id="role">
                        <option value="user">User</option>
                        <option value="admin">Admin</option>
                        <option value="moderator">Moderator</option>
                    </select>
                </div>

                <!-- Submit Button -->
                <button type="submit" class="btn btn-custom w-100">Register</button>
            </form>

            <!-- Success Message -->
            <div class="mt-3 text-center text-success" id="successMessage" style="display: none;">
                ✅ Registration Successful!
            </div>
        </div>
    </div>

    <!-- JavaScript for Form Validation -->
    <script>
        document.getElementById("registrationForm").addEventListener("submit", function(event) {
            event.preventDefault();
            let password = document.getElementById("password").value;
            let confirmPassword = document.getElementById("confirmPassword").value;

            if (password !== confirmPassword) {
                alert("Passwords do not match!");
            } else {
                document.getElementById("successMessage").style.display = "block";
            }
        });
    </script>

</body>
</html>
