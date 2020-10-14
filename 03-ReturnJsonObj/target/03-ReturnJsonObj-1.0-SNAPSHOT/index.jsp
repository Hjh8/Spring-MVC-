<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>HelloSpringMVC</title>
    <script type="text/javascript">
        function RrsAjax() {
            //1.创建一个异步对象
            let xmlhttp=new XMLHttpRequest();
            //2.设置请求方式和请求地址
            xmlhttp.open("post","some.do",true);
            //3.发送请求
            xmlhttp.send("name=codekiang&age=18");
            //4.监听状态变化
            xmlhttp.onreadystatechange = function (ev2) {
                if (xmlhttp.readyState===4){//判断是否到4
                    if(xmlhttp.status>=200&&xmlhttp.status<300||xmlhttp.status===304){
                        //5.处理返回结果
                        console.log('接受到服务器返回的结果');
                        let json = JSON.parse(xmlhttp.responseText);
                        console.log("name:"+json.name,"age:"+json.age);
                    }else {
                        console.log('没有接受到服务器返回的结果');
                    }
                }
            }
        }
    </script>
</head>
<body>
    <button id="btn" onclick="RrsAjax()">发送ajax请求</button>
</body>
</html>


