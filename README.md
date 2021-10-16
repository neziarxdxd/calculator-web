# calculator-web


## ROUTES

GET: `localhost:8080/calculator/add/?num1=60&num2=20`

POST:`localhost:8080/calculator/subtract/?num1=60&num2=20`

GET:`localhost:8080/calculator/multiply/?num1=60&num2=20`

GET:`localhost:8080/calculator/divide/?num1=60&num2=30`

GET:`localhost:8080/calculator/sqrt/?num=25`


Base url is /calculator

## ADD operation

Uses HTTP GET

Sub-url /add

Send 2 arguments using via URL

Returns MediaType.TEXT_PLAIN

## SUBTRACT operation

Uses HTTP POST

Sub-url /subtract

Send 2 arguments using via Form

Returns MediaType.TEXT_PLAIN

DIVIDE operation

Uses HTTP GET

Sub-url /divide

Send 2 arguments using via URL

Returns MediaType.TEXT_PLAIN

## MULTIPLY operation

Uses HTTP GET

Sub-url /multiply

Send 2 arguments using via URL

Returns MediaType.TEXT_PLAIN

## SQRT operation

Uses HTTP GET

Sub-url /sqrt

Send 1 argument using via URL

Returns MediaType.TEXT_PLAIN

All operations will delegate to a Calculator component
