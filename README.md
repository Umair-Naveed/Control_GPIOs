# Control_GPIOs
Control GPIOs of Raspberry Pi by Using Android App and a third party library "GenAsync.lib"
You have to Run this App on Phone.

On the Raspberry Pi side:
Before Installing Apache2 First of all update and upgrade your raspberry pi by using shell command
command: sudo apt-get update && sudo apt-get upgrade
After this install Apache2
sudo apt-get install apache2 -y
After installing Apache 2, install the PHP 5 and the PHP libraries
command: sudo apt-get install php libapache2-mod-php -y
copy file "ControlSwitches.php" to the directory of raspberry pi: /var/www/html/

Now you done!
