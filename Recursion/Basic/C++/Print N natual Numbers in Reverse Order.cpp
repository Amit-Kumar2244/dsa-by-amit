#include <iostream>
using namespace std;

void printNaturalNumbers(int n) {
    if (n <= 0) // BASE CONDITION.
        return;
    
    cout << n << " ";
    printNaturalNumbers(n - 1);  // Recursive call.
    
}

int main() {
    int n;
    cout << "Enter value of n: ";
    cin >> n;

    cout << "First " << n << " natural numbers: ";
    printNaturalNumbers(n);
    cout << endl;

    return 0;
}

