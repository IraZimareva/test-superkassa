# Тестовое задание в компанию Superkassa
**Стек технологий: Java8, Postgres, Hibernate, SpringBoot**

**Предварительные условия:** <br> 
Предзаполненная таблица в базе данных postgres. Имя пользователя и название таблицы должно точно соответствовать указанным.
>    dropdb --if-exists sk_example_db <br> 
    dropuser --if-exists sk_example_user <br> 
    createuser sk_example_user -P <br> 
    createdb -O sk_example_user sk_example_db <br> 
    psql -U sk_example_user -d sk_example_db <<EOF <br> 
    CREATE TABLE sk_example_table (id SERIAL, obj JSONB NOT NULL, PRIMARY KEY(id)); <br> 
    INSERT INTO sk_example_table (obj) VALUES ('{"current":0}'::JSONB); <br> 
    EOF

**Задача:** <br> 
Реализовать Spring приложение с обработкой POST запроса по урлу /modify. В процессе обработки необходимо атомарно увеличить на величину *add* значение поля *current* столбца *obj* строки идентифицируемой *id* в таблице *sk_example_table*, и вернуть полученое значение через API. В случае невозможности провести операцию, вернуть http статус 418.

**Endpoint:** <br> 
POST /modify with Request body as JSON: 
  {
       "id": \<number>,
       "add": \<number>
  }
