<!DOCTYPE html>
<html>
<head>
    <title>Car Loan Application</title>
</head>
<body>
<h2>Car Loan Application</h2>
<form action="applyCarLoan" method="post">
    Monthly Income (RM): <input type="text" name="income" required><br><br>
    Employment Status:
    <select name="status">
        <option value="Full-Time">Full-Time</option>
        <option value="Part-Time">Part-Time</option>
        <option value="Unemployed">Unemployed</option>
    </select><br><br>
    Monthly Debt (RM): <input type="text" name="debt" required><br><br>
    Desired Loan Amount (RM): <input type="text" name="loan" required><br><br>
    Loan Duration (years): <input type="text" name="years" required><br><br>
    <button type="submit">Apply</button>
</form>
</body>
</html>
