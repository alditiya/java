data = "ini adalah string"
print(data)
print(type(data))

#cara membuat string

'''
    1. dengan menggunakan single quote '....'
    2. menggunakan double quote
'''

data = 'menggunakan single quote'
print(data)
data ="ini menggunakan double quote"
print(data)

print('"Hallo, apa kabar?"')
print("'Hallo, apa kabar?'")
print("ini hari jum'at")

#2. menggunakan tanda \

# membuat tanda ' menjadi string
print('mari shalat jum\'at')
print('g\day, isn\'t it?')

# backslash
print("C:\\user\\Ucup")

# tab
print("ucup\totong,jauhan")

# backspace
print("ucup \botong, jadi deketan")

# newline
print("baris pertama.\nbaris kedua.") #LF Line feed
print("baris pertama.\rbaris kedua.") #CR carriage return
print("baris pertama.\r\nbaris kedua.")#CRLF line feed carriage return

# 3. string literal atau raw

# hati-hati
print('C:\new folder')# path salah

# menggunakan raw string
print(r'C:\new folder')

#multiline literal string
print("""
Nama : ucup
kelas : 3 SD
""")

# multiline literal string dan RAW
print(r"""
Nama : ucup
kelas : 3 SD \new normal
website : www.ucup.com/newID
""")