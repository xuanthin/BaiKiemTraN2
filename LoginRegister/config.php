<?php
$host="localhost";
$user="root";
$password="";
$db = "users";
$con = mysqli_connect($host,$user,$password,$db);
// Check connection
if (mysqli_connect_errno())
  {
  echo "Failed to connect to MySQL: " . mysqli_connect_error();
  }else{  //echo "Connect"; 
  
   }

?>
