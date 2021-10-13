# calculator-web

a.	Base url is /calculator
b.	ADD operation
i.	Uses HTTP GET
ii.	Sub-url /add
iii.	Send 2 arguments using via URL
iv.	Returns MediaType.TEXT_PLAIN
c.	SUBTRACT operation
i.	Uses HTTP POST
ii.	Sub-url /subtract
iii.	Send 2 arguments using via Form
iv.	Returns MediaType.TEXT_PLAIN
d.	DIVIDE operation
i.	Uses HTTP GET
ii.	Sub-url /divide
iii.	Send 2 arguments using via URL
iv.	Returns MediaType.TEXT_PLAIN
e.	MULTIPLY operation
i.	Uses HTTP GET
ii.	Sub-url /multiply
iii.	Send 2 arguments using via URL
iv.	Returns MediaType.TEXT_PLAIN
f.	SQRT operation
i.	Uses HTTP GET
ii.	Sub-url /sqrt
iii.	Send 1 argument using via URL
iv.	Returns MediaType.TEXT_PLAIN
g.	All operations will delegate to a Calculator component
