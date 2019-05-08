#jeuxaratter

from random import*
L=[]
gain=0
gain1=0
gain2=0
for i in range(3):
    L.append (randint(1,5))
print(L)
    
if sum(L)%2==0:
        gain+=1
        
if max(L)==2:
        gain1+=2
        
if L[0]==L[1] or L[1]==L[2] or L[0]==L[2]:
        gain2+=5

else :
        gain+0

gain3=gain+gain1+gain2
print(gain3)
