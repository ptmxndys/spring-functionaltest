DROP FUNCTION IF EXISTS HALF_SALE();

CREATE FUNCTION HALF_SALE() RETURNS INTEGER AS '
DECLARE
    RET INTEGER;
BEGIN
    UPDATE t_book t1 SET price = (SELECT price/2 FROM t_book t2 WHERE t1.book_id = t2.book_id);
    SELECT COUNT(*) INTO RET FROM t_book;
    RETURN RET;
END;
' LANGUAGE 'plpgsql';
