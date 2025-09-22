CREATE TABLE accounts
(
    id      SERIAL PRIMARY KEY,
    owner   VARCHAR(100),
    balance NUMERIC
);

INSERT INTO accounts(owner, balance)
VALUES ('Ali', 1000),
       ('Veli', 500);

BEGIN ; -- Transaction Başlatılır
UPDATE accounts SET balance = balance - 200 WHERE owner = 'Ali';
UPDATE accounts SET balance = balance + 200 WHERE owner = 'Veli';

COMMIT ; -- Değişiklikleri kaydeder.

-----------

BEGIN ; -- Transaction Başlatılır
UPDATE accounts SET balance = balance - 100 WHERE owner = 'Ali';
--UPDATE accountz SET balance = balance + 100 WHERE owner = 'Veli';

ROLLBACK ; -- Tüm işlemler iptal edilicek.

-----------

BEGIN ;-- Transaction Başlatılır

INSERT INTO employees(employee_id,first_name, deparment_id, salary)
VALUES (9,'Ahmet', 2,1000),
       (10,'Mehmet',2,15000);
COMMIT ; -- Değişiklikleri kaydeder.

-----------

BEGIN ;

UPDATE employees SET salary = salary + 1000 WHERE deparment_id = 1;

SAVEPOINT before_hr;

UPDATE employees SET salary = salary + 2000 WHERE deparment_id = 2;

ROLLBACK TO before_hr;

COMMIT ;