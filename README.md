


## Database

docker run --rm --name mysql2 -p 3306:3306 -e MYSQL_ROOT_PASSWORD=test -d mysql

Data dump:

docker exec -i mysql_database mysql -uroot -ptest LOCAL < schema.sql