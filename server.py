# echo_server.py
import socket

s = socket.socket()
s.bind(('localhost', 12345))
s.listen(1)

conn, addr = s.accept()
data = conn.recv(1024)
conn.sendall(data)

conn.close()
s.close()
