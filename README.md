# MA_Coordination (Multi-Access Coordination)
This code is a program for verification of chapter 3 of master's thesis.


  Multi-Access 환경: 여러 개의 인터페이스를 동시에 지원하는 IoT 디바이스가 여러 인터페이스를 활용하여 Cloud 혹은 IoT-gateway로 연결이 가능한 환경
  
  MA_Coordination의 목적:
    - 여러 개의 인터페이스를 동시에 지원하는 IoT 디바이스가 하나의 인터페이스를 활용하여 데이터를 보내고 있다.
    - 그러던 중 데이터를 전송하고 있는 인터페이스의 연결이 끊긴다면 다른 인터페이스를 활용하여 데이터를 계속 보낼 수 있도록 제어한다.
    - 유선 인터페이스를 통해 데이터를 전송한다면 다중-경로 토폴로지를 통해서 데이터를 전송하는데, 이때 데이터를 전송할 경로를 ONOS SDN controller의 도움으로 선택한다.
    - 만약 다중-경로 토폴로지 상에 데이터를 보내고 있는 경로의 연결이 끊어진다면, 대안 경로를 탐색하여 데이터를 보낼 수 있도록 제어한다.
    - 위의 설명한 모든 과정은 ONOS SDN controller의 Intent Framework를 통하여 제어 한다.

## For more imformation, please find the concept.pdf file on this repository.
