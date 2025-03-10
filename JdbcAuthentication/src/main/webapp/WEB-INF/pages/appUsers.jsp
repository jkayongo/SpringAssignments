<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>App Users</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f8f9fa;
        }
        .container {
            margin-top: 30px;
        }
        .card {
            border-radius: 10px;
            box-shadow: 0px 4px 6px rgba(0, 0, 0, 0.1);
        }
        .status-active {
            color: green;
            font-weight: bold;
        }
        .status-inactive {
            color: red;
            font-weight: bold;
        }
    </style>
</head>
<body>

    <div class="container">
        <h2 class="mb-4 text-center">📋 App Users</h2>

        <!-- Search Bar -->
        <div class="mb-3">
            <input type="text" id="searchInput" class="form-control" placeholder="Search users..." onkeyup="searchUsers()">
        </div>

        <!-- Users Table -->
        <div class="card p-3">
            <table class="table table-bordered">
                <thead class="table-dark">
                    <tr>
                        <th>ID</th>
                        <th>Name</th>
                        <th>Email</th>
                        <th>Role</th>
                        <th>Status</th>
                    </tr>
                </thead>
                <tbody id="userTable">
                    <tr>
                        <td>1</td>
                        <td>John Doe</td>
                        <td>john@example.com</td>
                        <td>Admin</td>
                        <td class="status-active">Active</td>
                    </tr>
                    <tr>
                        <td>2</td>
                        <td>Jane Smith</td>
                        <td>jane@example.com</td>
                        <td>User</td>
                        <td class="status-active">Active</td>
                    </tr>
                    <tr>
                        <td>3</td>
                        <td>Michael Johnson</td>
                        <td>michael@example.com</td>
                        <td>Moderator</td>
                        <td class="status-inactive">Inactive</td>
                    </tr>
                    <tr>
                        <td>4</td>
                        <td>Sarah Brown</td>
                        <td>sarah@example.com</td>
                        <td>User</td>
                        <td class="status-active">Active</td>
                    </tr>
                </tbody>
            </table>
        </div>
    </div>

    <!-- JavaScript for Search Feature -->
    <script>
        function searchUsers() {
            let input = document.getElementById("searchInput").value.toLowerCase();
            let rows = document.querySelectorAll("#userTable tr");

            rows.forEach(row => {
                let text = row.innerText.toLowerCase();
                row.style.display = text.includes(input) ? "" : "none";
            });
        }
    </script>

</body>
</html>
