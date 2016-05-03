ta = Array(1, 2, 3, 4, 5)
val x = data.tail

val rdd = sc.parallelize(data)
val even = rdd.filter(n => n%2 == 0)
