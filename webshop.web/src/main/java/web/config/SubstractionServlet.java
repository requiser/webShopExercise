package web.config;


import hu.iit.me.service.BasicCalculator;
import hu.iit.me.service.CalculatorInterface;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SubstractionServlet extends HttpServlet {

    CalculatorInterface calculator;

    @Override
    public void init() throws ServletException{
        calculator= new BasicCalculator();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}