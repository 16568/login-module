package com.login.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.login.model.amodel;
import com.login.service.aservice;

import java.io.*;
import com.login.controller.Autowired;
import com.login.controller.Controller;
import com.login.controller.ModelAndView;
//import com.login.controller.RequestMapping;
//import com.login.model.amodel;
//import com.login.service.aService;

//@Controller
public class a extends HttpServlet {
	
		//@Autowired
		private aservice aservice;

		//@RequestMapping("adduser")
		public ModelAndView add(HttpServletRequest request,HttpServletResponse response)
		{
			ModelAndView mav =new ModelAndView();
			mav.setViewName("add");
			return mav;
		}
			//@RequestMapping("Add")
			
			public ModelAndView addUser(amodel addjava)
			{
				ModelAndView mav=new ModelAndView();
				String valid=aservice.validateUser(addjava);
				System.out.println(valid);
				mav.addObject("message", valid);
				mav.setViewName("add");
				return mav;
			}
			
			
			@RequestMapping("viewuser")
		    public ModelAndView ViewPage(HttpServletRequest request,HttpServletResponse response)
		    {
			ModelAndView mav=new ModelAndView();
			mav.setViewName("view");
			return mav;
		    }
			

			@RequestMapping("search")
			public  ModelAndView DisplayUser(HttpServletRequest request,HttpServletResponse response,amodel data)
			{
				ModelAndView mav=new ModelAndView();
				amodel exists=aservice.IsPresent(data);
				mav.addObject("exists",exists);
				mav.setViewName("view");
				return mav;	
			}	
			
			
			@RequestMapping("updateuser")
			public ModelAndView UpdatePage(HttpServletRequest request,HttpServletResponse response) {
				ModelAndView mav=new ModelAndView();
				mav.setViewName("update");
				return mav;
				
				
			}
			@RequestMapping("updatedata")
			public ModelAndView UpdateDate(HttpServletRequest request,HttpServletResponse response, amodel data)
			{
				ModelAndView mav=new ModelAndView();
				String valid=aservice.UpdateData(data);
				mav.addObject("valid", valid);
				mav.setViewName("update");
				return mav;
			}
			
			@RequestMapping("checktoupdate")
			public  ModelAndView checktoUpdate(HttpServletRequest request,HttpServletResponse response,amodel data)
			{
				String msg="User doesn't exist!!!!";
				ModelAndView mav=new ModelAndView();
				amodel exists=aservice.IsPresent(data);
				if(exists==null)
				{
					mav.addObject("message", msg);
					mav.setViewName("update");
				}
				else
				{
				mav.addObject("exists",exists);
				mav.setViewName("update");
				}
				return mav;
			}
			
			
				@RequestMapping("loginuser")
				public ModelAndView login(HttpServletRequest request,HttpServletResponse response)
				{
					ModelAndView mav=new ModelAndView();
					mav.setViewName("login");
					return mav;
				}
				
				@RequestMapping("login")
				public ModelAndView loginuser(HttpServletRequest request,HttpServletResponse response,amodel data)
				{
					ModelAndView mav=new ModelAndView();
					String loggedin=aservice.loginservice(data);
					mav.addObject("login",loggedin);
					mav.setViewName("success");
					return mav;
				}

			}

			
			
			

				

				  

