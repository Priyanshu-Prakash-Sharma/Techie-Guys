from flask import Flask, request, jsonify

app = Flask(__name__)

@app.route('/analyze', methods=['POST'])
def analyze_performance():
    data = request.json
    weak_topics = [q['topic'] for q in data['questions'] if q['score'] < 5]
    study_plan = {"extra_hours": 2, "focus_topics": weak_topics}
    return jsonify(study_plan)

if __name__ == '__main__':
    app.run(port=5000)
