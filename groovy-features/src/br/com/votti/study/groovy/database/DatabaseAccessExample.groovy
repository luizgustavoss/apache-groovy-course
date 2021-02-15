package br.com.votti.study.groovy.database

import groovy.sql.Sql


@Grab(group = "org.codehaus.groovy", module = "groovy-all", version = "2.3.11")
@Grab(group = "mysql", module = "mysql-connector-java", version = "8.0.12")

String username = "root"
String password = "mysql"

def sql = Sql.newInstance("jdbc:mysql://localhost:3306/twitter",
        username, password, "com.mysql.jdbc.Driver")
println "Connected!"

sql.execute("DROP TABLE IF EXISTS users")

sql.execute '''
CREATE TABLE users (
    id INT NOT NULL,
    username VARCHAR(50) NOT NULL,
    bio VARCHAR(100) NULL,
    PRIMARY KEY (id)
)
'''

sql.execute ''' 
INSERT INTO users (id, username, bio) VALUES (1, 'luiz', '@lugustso')
'''

sql.execute ''' 
INSERT INTO users (id, username, bio) VALUES (2, 'mariana', '@m.budiski')
'''

sql.eachRow("select * from users") {row ->
    println "profile: ${row.username} - ${row.bio}"
}

sql.close()
