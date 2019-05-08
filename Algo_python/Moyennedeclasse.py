 #app3=conseildeclasse
L=[]
i=0
note=0
m=0

for i in range (5):
    #L.append(float(input()))
moyenne =Sum(L)/30
print(L)print("La moyenne est de " , moyenne)print ( "la note maximal est ",max(L))print("la note ninimal est ",min(L))print("l'étendu est de " ,max(L)-min(L))

while i <len(L):
 if L[i] <=10:note+=L[i]i+=1

print("les notes sont " ,note)

mediane =  ( len(L) //2)
print("la médiane est de :",mediane)
L.remove(max(L))
L.remove(min(L))
print("la moyenne élaguée est:",m)

