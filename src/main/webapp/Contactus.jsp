<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Contact Us</title>
    <style>
       
         body {
            font-family: Arial, sans-serif;        
           background-color: #f8f9fa;
        }
        ul {
			
			margin: 0px;
            padding: 20px;
            border-radius: 10px;
            list-style-type: none;
            margin: 0;
            padding: 0;
            overflow: hidden;
            background-color: #343A40 ;
           
            width: 100%;
        }

        li {
            float: left;
            
        }
        li strong {
			float: left;
			 color: white;
            text-align: center;
            padding: 14px 110px;
            text-decoration: none;
			
		}

        li a {
            display: block;
            color: white;
            text-align: center;
            padding: 14px 16px;
            text-decoration: none;
        }      
        

        h2 {
        text-align : center;
            color: #333;
        }

        form {
            max-width: 400px;
            margin: 20px auto;
            padding: 20px;
            background-color: #343A40;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }

        label {
            display: block;
            margin-bottom: 8px;
            color: white;
        }

        input,
        textarea {
            width: 100%;
            padding: 8px;
            margin-bottom: 15px;
            border: 1px solid #ccc;
            border-radius: 4px;
            box-sizing: border-box;
        }

        input[type="submit"] {
           background-color: #6C757D;
            color: white;
            padding: 10px 15px;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }

        input[type="submit"]:hover {
           background-color: #ADB5BD;
        }
    </style>
</head>
<body>

 <div class="nav">
        <ul>
			
              <li><a href="Home.html">Home</a></li>
            <li><a href="input.html">Sorting Algorithms</a></li>
            <li><a href="inputsearch.html">Searching Algorithms</a></li>
            <li><a href="arrayopt.html">Array Operations</a></li>
            <li><a href="learnDSA.html">Learn Data Structure Algorithm</a></li>
             <li><a href="Java_Quiz.jsp">DSA Quiz</a></li>
              <li><a href="About.jsp">About</a></li>
               <li><a href="Contactus.jsp">Contact us</a></li>
                <li><a href="index.jsp">Login</a></li>
                  <li><strong>AlgoLab</strong></li>
        </ul>
    </div>    

    <h2>Contact Us</h2>
    <form action="ContactUsServlet" method="post">
        <label for="name">Name:</label>
        <input type="text" id="name" name="name" required><br>
        
        <label for="email">Email:</label>
        <input type="email" id="email" name="email" required><br>
        
        <label for="mobile">Mobile Number:</label>
        <input type="tel" id="mobile" name="mobile" required><br>
        
        <label for="message">Message:</label>
        <textarea id="message" name="message" required></textarea><br>
        
        <input type="submit" value="Submit">
    </form>
</body>
</html>