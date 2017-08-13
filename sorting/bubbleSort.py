num=input("How many numbers you want to sort : ")
i=0
j=0
arr=[]
while(i<num):
    j=i+1
    arr.append(input("enter "+ `j`+"th element : "))
    i += 1

for i in range(0,num,1):
    for j in range(i+1,num,1):
        if(arr[i]>arr[j]):
            temp=arr[i]
            arr[i]=arr[j]
            arr[j]=temp

for k in range(0,num,1):
    print arr[k]
    
