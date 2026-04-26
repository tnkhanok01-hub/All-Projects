package controller;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;

public class CarLoanServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        double income = Double.parseDouble(request.getParameter("income"));
        double debt = Double.parseDouble(request.getParameter("debt"));
        double loanAmount = Double.parseDouble(request.getParameter("loan"));
        int years = Integer.parseInt(request.getParameter("years"));
        String status = request.getParameter("status");

        // DSR
        double dsr = (debt / income) * 100;

        // Interest rate
        double interestRate = 0;
        if (status.equals("Full-Time"))
            interestRate = 3.5;
        else if (status.equals("Part-Time"))
            interestRate = 4.5;
        else
            interestRate = 5.0;

        // Monthly interest
        double monthlyInterest = interestRate / (12 * 100);

        // Monthly payment
        int months = years * 12;
        double monthlyPayment = (loanAmount * monthlyInterest) /
                (1 - Math.pow(1 + monthlyInterest, -months));

        // Eligibility
        String appStatus;
        double approvedAmount;

        if (dsr < 40 && monthlyPayment < income * 0.3) {
            appStatus = "Approved";
            approvedAmount = loanAmount;
        } else {
            appStatus = "Denied";
            approvedAmount = 0;
        }

        request.setAttribute("status", appStatus);
        request.setAttribute("amount", approvedAmount);
        request.setAttribute("rate", interestRate);
        request.setAttribute("payment", monthlyPayment);
        request.setAttribute("years", years);

        RequestDispatcher rd = request.getRequestDispatcher("result.jsp");
        rd.forward(request, response);
    }
}
