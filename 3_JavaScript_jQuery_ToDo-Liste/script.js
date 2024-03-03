$(document).ready(function() {
    // Laden der gespeicherten ToDos
    const gespeicherteTodos = JSON.parse(localStorage.getItem('todos')) || [];
    gespeicherteTodos.forEach(todo => fügeTodoHinzu(todo.text, todo.erledigt));

    // ToDo hinzufügen
    $('#hinzufuegenButton').click(function() {
        const todoText = $('#neuesTodo').val().trim();
        if (todoText) {
            fügeTodoHinzu(todoText, false);
            $('#neuesTodo').val('');
        }
    });

    // Funktion zum Hinzufügen eines neuen ToDo
    function fügeTodoHinzu(text, erledigt) {
        const erledigtKlasse = erledigt ? ' class="erledigt"' : '';
        $('#todoListe').append(
            `<li${erledigtKlasse}><input type="checkbox" ${erledigt ? 'checked' : ''}> 
            ${text} <a href="#" class="loeschen">Löschen</a></li>`
        );
        aktualisiereSpeicherung();
    }

    // ToDo als erledigt markieren
    $('#todoListe').on('change', 'input[type="checkbox"]', function() {
        $(this).parent().toggleClass('erledigt');
        aktualisiereSpeicherung();
    });

    // ToDo löschen
    $('#todoListe').on('click', '.loeschen', function() {
        $(this).parent().remove();
        aktualisiereSpeicherung();
    });

    // Speicherung im Browser
    function aktualisiereSpeicherung() {
        const todos = [];
        $('#todoListe li').each(function() {
            todos.push({
                text: $(this).text().replace('Löschen', '').trim(),
                erledigt: $(this).hasClass('erledigt')
            });
        });
        localStorage.setItem('todos', JSON.stringify(todos));
    }
});