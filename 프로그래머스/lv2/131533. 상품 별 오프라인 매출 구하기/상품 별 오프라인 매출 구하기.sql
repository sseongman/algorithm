-- 코드를 입력하세요
SELECT
PRODUCT_CODE,
SUM(SALES_AMOUNT*PRICE) SALES
FROM PRODUCT P
INNER JOIN OFFLINE_SALE O
ON P.PRODUCT_ID = O.PRODUCT_ID
GROUP BY PRODUCT_CODE
ORDER BY SALES DESC, PRODUCT_CODE
;