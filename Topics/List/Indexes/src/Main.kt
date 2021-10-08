fun solution(products: List<String>, product: String) {
    for (prod in products.indices) {
        if (products[prod] == product) {
            print("$prod ")
        }
    }
}