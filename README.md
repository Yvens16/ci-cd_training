# ci-cd_training

## Using mysql and phpmyadmin images
 1- `sudo docker pull mysql`
 2- `sudo docker network create net-db` (create network to connect mysql client)
 3 - `sudo docker run --name my-db --network net-db -e MYSQL_ROOT_PASSWORD=secret -d mysql:latest` (run mysql image as container)
 4 - `sudo docker run -it --network net-db --rm mysql mysql -hmy-db -root -p` (run the mysql client and type mysql commands)

 Or 
 4 bis -  `sudo docker pull phpmyadmin` (install phpmyadmin)
 5- `sudo docker run --name phpmyadmin --network net-db -d --link my-db:db -p 8081:80 phpmyadmin`(run the phpmy admin client)
 6 - Don't forget to add the port 8081 as tcp inbound anywhere for ipv4 address
 7 - Open phpmyadmin through the ipv4 adress:8081 on the internet