<?php
include 'authent.php';
session_destroy();
header("location:index.php");
?>
