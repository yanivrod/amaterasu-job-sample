val oddRdd = AmaContext.getRDD[Int]("start", "rdd").filter(x=>x/2 == 0)
oddRdd.take(5).foreach(println)

val highNoDf = AmaContext.getDataFrame("start", "x").where("_1 > 3")
highNoDf.write.json(s"${env.outputRootPath}/test1")
