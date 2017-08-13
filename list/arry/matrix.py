num = input("Enter the size of matrix : ")
mat=[]
mat1=[]
mul=[]

i=0
j=0
k=0
add=0
while(add<num):
    mat.append([])
    mat1.append([])
    mul.append([])
    add+=1

    
for i in range(0,num,1):
    print "Enter elements Matrix:1 Row : "+`i+1`
    for j in range(0,num,1):
        mat[i].append(input("enter th element : "))

for i in range(0,num,1):
    print "Enter elements Matrix : 2 of row : "+`i+1`
    for j in range(0,num,1):
        mat1[i].append(input("enter th element : "))

print "Ist Matrix"
for i in range(0,num,1):
    print "Row : "+`i+1`+"" +`mat[i]`



print "IInd Matrix"
for i in range(0,num,1):
    print "Row : "+`i+1`+"" +`mat1[i]`   

add=0
for i in range(0,num,1):
    for j in range(0,num,1):
        for k in range(0,num,1):
            add+=mat[i][k]*mat1[k][j]
        mul[i].append(add)
        add=0
        

print "Multiplication Matrix"
for i in range(0,num,1):
    print "Row : "+`i+1`+"" +`mul[i]`



