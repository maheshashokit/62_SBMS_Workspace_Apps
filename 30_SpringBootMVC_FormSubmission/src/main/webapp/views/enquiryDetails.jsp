<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Registration Page</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
<div class="text-danger text-center">
      ${pageTitle} <br/>
      ${enquiryStatus}
   </div>
    <div class="container mt-5">
        <div class="row justify-content-center">
            <div class="col-md-6">
                <div class="card">
                    <div class="card-header bg-info">
                        <h4 class="text-danger bold">AshokIT Enquiry Form</h4>
                    </div>
                    <div class="card-body">
                        <spring:form action="${pageContext.request.contextPath}/enquiry/processEnquiry" modelAttribute="enquiryForm">
                            <div class="form-group">
                                <label for="Name">Name</label>
                                <spring:input path="name" cssClass="form-control" readonly="${readOnly}"/>
                            </div>
                            <div class="form-group">
                                <label for="EmailID">EmailID</label>
                                <spring:input path="emailId" cssClass="form-control" />
                            </div>
                            <div class="form-group">
                                 <label for="ContactNo">ContactNo</label>
                                 <spring:input path="contactNo" cssClass="form-control" />
                            </div>
                            <div class="form-group">
                                <label for="Course">Course</label>
		                        <spring:select path="courseName" cssClass="form-control" disabled="${readOnly}">
										<spring:option value=""></spring:option>
										<spring:option value="Angular">AngularJS</spring:option>
										<spring:option value="React">ReactJS</spring:option>
										<spring:option value="SpringBoot">Spring Boot Framework</spring:option>
										<spring:option value="Microservices">Microservices</spring:option>
										<spring:option value="Aws">AWS</spring:option>
										<spring:option value="Devops">Devops</spring:option>
								</spring:select>
                            </div>
                            <spring:hidden path="enquiryId"/>
                            <button type="submit" class="btn btn-danger btn-block">Send Enquiry</button>
                        </spring:form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>
</html>