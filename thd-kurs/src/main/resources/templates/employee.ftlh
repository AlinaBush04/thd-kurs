<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Books</title>
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Montserrat:wght@100;200;300;400;500;600;700;800;900&display=swap" rel="stylesheet">
</head>
<body>
<div class="list">
    <h1 class="text">
        Библиотека
    </h1>
</div>
<div class="failes_list">
    <form method="post" action="/createEmployee">
        <span>ФИО</span>
        <input required name="full_name">



        <button type="submit" class="button-17" role="button">Добавить</button>
    </form>
</div>
<table class="ta">
    <thead class="th">
    <tr class="tr">
        <th>ID</th>
        <th>ФИО</th>
        <th>Должность</th>

    </tr>
    </thead>
    <tbody>
    <#list employees as employee>
        <tr>
            <td>${employee.id}</td>
            <td>${employee.full_name}</td>
            <td>
                <a href="/employee/${employee.id}" class="button-17" role="button" style="text-decoration: none">Редактировать</a>
                <a href="/employee/delete/${employee.id}" class="button-17" role="button" style="text-decoration: none">Удалить</a>
            </td>
        </tr>
    </#list>

    </tbody>
</table>
</body>
</html>