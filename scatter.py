from scipy import integrate

result, error = integrate.quad(lambda x: x**2, 0, 1)
print("Single Integration Result:", result)
from scipy import integrate

def f(x, y):
    return x * y

result, error = integrate.dblquad(f, 0, 1, lambda x: 0, lambda x: 1)
print("Double Integration Result:", result)
from scipy import integrate

def f(x, y, z):
    return x * y * z

result, error = integrate.tplquad(f, 0, 1,  # z limits
                                      lambda z: 0, lambda z: 1,  # y limits
                                      lambda z, y: 0, lambda z, y: 1)  # x limits
print("Triple Integration Result:", result)
import numpy as np
from scipy.interpolate import interp1d

x = np.array([0, 1, 2])     # known x-values
y = np.array([0, 1, 4])     # known y-values (y = x^2)

f = interp1d(x, y)          # create interpolation function

print("Interpolated value at x=1.5:", f(1.5))  # result: 2.25 (linear)
import numpy as np
from scipy.interpolate import RegularGridInterpolator

# Known x, y values (grid)
x = [0, 1, 2]
y = [0, 1, 2]

# z-values for each (x, y) pair
z = [[0, 1, 4],
     [1, 2, 5],
     [4, 5, 8]]

# Create interpolator (note: order is (y, x) → so we pass y, x here)
f = RegularGridInterpolator((y, x), z)

# Point at which we want to interpolate: (y, x) = (1.5, 1.5)
point = [1.5, 1.5]  # (y, x)

# Interpolate and print result
print("Interpolated value at (1.5, 1.5):", f(point))
import socket

# Get machine (host) name
hostname = socket.gethostname()
print("Machine Name:", hostname)

# Get IPv4 address
ip_address = socket.gethostbyname(hostname)
print("IPv4 Address:", ip_address)
import socket

# Enter the remote machine (hostname or domain)
remote_host = 'www.google.com'

# Get IP address
ip_address = socket.gethostbyname(remote_host)

print(ip_address)
import ipaddress

ip_str = "192.168.1.1"
ip = ipaddress.IPv4Address(ip_str)

print("Integer:", int(ip))
print("Binary:", bin(int(ip)))
print("Hex:", hex(int(ip)))
print("Octal:", oct(int(ip)))
import socket

# Enter port number and protocol
port = 443
protocol = 'tcp'

# Get service name
service = socket.getservbyport(port, protocol)

print(f"Service on port {port}/{protocol} is:", service)



