package br.edu.univas.si.lab6.bmi.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONException;
import org.json.JSONObject;

import br.edu.univas.si.lab6.bmi.service.BMIService;


public class BMIController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Float weight = Float.valueOf(request.getParameter("weight"));
		Float height = Float.valueOf(request.getParameter("height"));
		
		
		Float bmiIndex = BMIService.getIndex(weight, height);
		String bmiDescription = BMIService.getDescription(bmiIndex);
		
		JSONObject json =  new JSONObject();
		
		try {
			json.append("index", bmiIndex);
			json.append("description", bmiDescription);
		} catch (JSONException e) {
			e.printStackTrace();
		}
		
		
		PrintWriter out = response.getWriter();
		
		out.write(json.toString());
	}

}
