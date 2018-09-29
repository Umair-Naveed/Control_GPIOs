<?php

exec("gpio mode 0 out");

if ($_POST["Toggle"] = "ON") {
	exec("gpio write 0 1");
}
if ($_POST["Toggle"] = "OFF") {
	exec("gpio write 0 0");
}

?>