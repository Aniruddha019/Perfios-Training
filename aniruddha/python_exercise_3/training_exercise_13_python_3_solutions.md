### Advanced
1.Implement binary search
```python
def bin(arr,left,right,key):
    if left > right or right < left:
        return None
    mid = (left + right) // 2

    if arr[mid] is key:
        return mid
    elif arr[mid] > key:
        right = mid - 1
        return bin(arr,left,right,key)
    elif arr[mid] < key:
        left = mid + 1
        return bin(arr,left,right,key)


arr = [3,5,23,6,99,11,22,4,6,77,88,23,34,44]
arr.sort()
print(arr)
print(bin(arr,0,len(arr)-1,99))

```
2.Print a matrix and rotate it anti-clockwise by 90
```python
def print_array(arr):
    for i in range(len(arr)):
        print("\n")
        for j in range(len(arr[0])):
            print(arr[i][j],end = "")

def rotate_matrix(mat):
    N = len(mat)
    for x in range(0, int(N/2)):
        for y in range(x, N-x-1):
            temp = mat[x][y]
            mat[x][y] = mat[y][N-1-x]
            mat[y][N-1-x] = mat[N-1-x][N-1-y]
            mat[N-1-x][N-1-y] = mat[N-1-y][x]
            mat[N-1-y][x] = temp
    return mat

mat = [[1,2,3],[4,5,6],[7,8,9]]
print_array(mat)

print("\n \n\nAfter 90 degree anticlockwise rotation:")
mat = rotate_matrix(mat)
print_array(mat)
```
3.Read a CSV file
```python
import csv
with open("file.csv","r") as f:
    data = csv.reader(f)
    for row in data:
        print(row)
```
4.Sort an array in python
```python
arr = [1,2,3,544,11,23,32,434,3]
arr.sort()
```
5.Call a URI and process json in python 
```python
import json,urllib.request

data = urllib.request.urlopen("https://api.github.com/users?since=100").read()
output = json.loads(data.decode('utf-8'))
print(output)
```
6.From a given dictionary in python, print the middle key/keys from sorted keys.
```python
d = {"k": "idh","v": "uu","b":"jbdc", "a":"dckhjbsdc"}
l = []
for e in d.keys():
    l.append(e)
l.sort()
print(l[:])
if len(l) % 2 is 0:
    print(d[l[(len(d))//2]],d[l[((len(d))//2)-1]])
else:
    print(d[l[(len(d))//2]])
```
