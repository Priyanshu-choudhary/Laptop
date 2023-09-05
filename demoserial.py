import serial
baudrate = 115200
serial_connection=serial.Serial('COM21', baudrate, timeout = 1)
 
while True:
    destination_file = open("test3.txt","wb")
    data = serial_connection.read(128)
    destination_file.write(data)
    print(data)
destination_file.close()    
    