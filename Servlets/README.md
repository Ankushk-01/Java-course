# Servlet

When a client sends the request to the Server. Server have two options which are listed below: 
1. one send the response in the form of static web page(index.html) which means it already have a template web page which the server sends when a request comes.

2. Other one is it can send the request to a program which can take inputs from the request it may be `username`, `email` or something else and generate the response from it in the form of html page, XML page or json format. This entire process is called generating dynamic web pages.

## Servlets use case

The servlet is a java based program which runs and generate the dynamic web page.It take the input as the client request and generate the response accordingly.
The servlet process must need to extends the `HTTPServelet` class.
Inside the Server we can have multiple servlets.

the process inside the server is called `web container` and a configuration file `web.xml` which tell the server for which end point we need to go to which servlet. The `web.xml` file also called the `deployment descriptor`.
