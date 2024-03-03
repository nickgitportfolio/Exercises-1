function wurfeln() {
    return Math.floor(Math.random() * 6) + 1;
}

function variante1() {
    let anzahlWurfe = 100;
    console.log(`Anzahl der Würfe: ${anzahlWurfe}`);
}

function variante2() {
    let anzahlSechser = 0;
    for (let i = 0; i < 100; i++) {
        if (wurfeln() === 6) anzahlSechser++;
    }
    console.log(`Anzahl der Sechser: ${anzahlSechser}`);
}

function variante3() {
    let wurf1, wurf2, versuche = 0;
    do {
        wurf1 = wurfeln();
        wurf2 = wurfeln();
        versuche++;
    } while (wurf1 !== wurf2);
    console.log(`Beide Würfel zeigen dieselbe Zahl nach ${versuche} Versuchen.`);
}

function variante4() {
    let wurf1, wurf2, versuche = 0;
    do {
        wurf1 = wurfeln();
        wurf2 = wurfeln();
        versuche++;
    } while (wurf1 !== 6 && wurf2 !== 6);
    console.log(`Einer der Würfel zeigt eine Sechs nach ${versuche} Versuchen.`);
}

function variante5() {
    let wurf1, wurf2, versuche = 0;
    do {
        wurf1 = wurfeln();
        wurf2 = wurfeln();
        versuche++;
    } while (!(wurf1 === 6 && wurf2 === 1) && !(wurf1 === 1 && wurf2 === 6));
    console.log(`Einer zeigt eine Sechs und der andere eine Eins nach ${versuche} Versuchen.`);
}

function spieleWurfelspiel(variante) {
    switch (variante) {
        case 1: variante1(); break;
        case 2: variante2(); break;
        case 3: variante3(); break;
        case 4: variante4(); break;
        case 5: variante5(); break;
        default: console.log("Ungültige Variante");
    }
}

spieleWurfelspiel(3);
