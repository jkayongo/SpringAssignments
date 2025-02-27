<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Pharmacy Sales Entry</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            padding: 20px;
        }
        .container {
            max-width: 600px;
            background: white;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0px 0px 10px rgba(0,0,0,0.1);
            margin: auto;
        }
        h2 {
            text-align: center;
        }
        label {
            font-weight: bold;
        }
        input, select {
            width: 100%;
            padding: 8px;
            margin: 5px 0 15px;
            border: 1px solid #ccc;
            border-radius: 4px;
        }
        button {
            background-color: #28a745;
            color: white;
            padding: 10px;
            border: none;
            width: 100%;
            border-radius: 4px;
            cursor: pointer;
        }
        button:hover {
            background-color: #218838;
        }
        .total {
            font-size: 18px;
            font-weight: bold;
            color: #333;
        }
    </style>
</head>
<body>
    <div class="container">
        <h2>Pharmacy Sales Entry</h2>
        <form id="salesForm">
            <label for="product">Product Name:</label>
            <input type="text" id="product" required>
            
            <label for="quantity">Quantity:</label>
            <input type="number" id="quantity" required oninput="calculateTotal()">
            
            <label for="price">Price per Unit:</label>
            <input type="number" id="price" required oninput="calculateTotal()">
            
            <p class="total">Total: $<span id="total">0.00</span></p>
            
            <label for="customer">Customer Name:</label>
            <input type="text" id="customer" required>
            
            <button type="submit">Submit Sale</button>
        </form>
    </div>

    <script>
        function calculateTotal() {
            let quantity = document.getElementById('quantity').value;
            let price = document.getElementById('price').value;
            let total = (quantity * price).toFixed(2);
            document.getElementById('total').innerText = total;
        }

        document.getElementById('salesForm').addEventListener('submit', function(event) {
            event.preventDefault();
            alert('Sale recorded successfully!');
        });
    </script>
</body>
</html>
