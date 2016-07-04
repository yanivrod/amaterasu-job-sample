println("@@@@@@@@@@@@@@@1@@@@@@@@@@@@@@@")
ta = Array(1, 2, 3, 4, 5)
val x = data.tail

val rdd = sc.parallelize(data)
val odd = rdd.filter(n => n%2 != 0)
println("@@@@@@@@@@@@@@2@@@@@@@@@@@@@@@")
