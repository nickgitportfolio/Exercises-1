$(document).ready(function() {
    // Event-Handler für das Laden von ajax.html
    $('body').on('click', '#ladeAjax, #ladeAjaxErneut', function() {
        $('#inhalt').load('/3_JavaScript_jQuery_ToDo-Liste/index.html');
    });

    // // Laden der todo.html beim Start
    // $('#inhalt').load('/3_JavaScript_jQuery_ToDo-Liste/index.html');
});
